(ns ^{:doc "while-let macro"}
    while-let.core)

(defmacro while-let
    "Repeatedly executes body while test expression is true, evaluating the body with binding-form bound to the value of test."
    [bindings & body]
    (let [form (first bindings) test (second bindings)]
        `(loop [~form ~test]
             ~@body
             (when ~form
                 (recur ~test)))))