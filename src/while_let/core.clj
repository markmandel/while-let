(ns ^{:doc "while-let macro"}
    while-let.core)

(defmacro while-let
    "Repeatedly executes body while test expression is true, evaluating the body with binding-form bound to the value of test."
    [[form test] & body]
    `(loop []
       (when-let [~form ~test]
             ~@body
             (recur))))
