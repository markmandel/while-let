(ns while-let.core-test
    (:use [midje.sweet]
          [while-let.core]))

(fact "Macro expand of while-let should be in the format I expect"
      (macroexpand
          '(while-let [form test]
                      (body))) => '(loop* [form test]
                                          (body)
                                          (clojure.core/when form (recur test)))
      )

(fact "Should continue to loop until the vector is empty"
      (let [data (atom [1 2 3 4 5])]
          (while-let [item (first @data)]
                     item => (first @data)
                     (swap! data rest))
          (empty? @data) => true))

