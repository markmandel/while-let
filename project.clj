(defproject while-let "0.2.0"
    :description "Repeatedly executes body while test expression is true, evaluating the body with binding-form bound to the value of test."
    :url "https://github.com/markmandel/while-let"
    :license {:name "Eclipse Public License"
              :url  "http://www.eclipse.org/legal/epl-v10.html"}
    :dependencies [[org.clojure/clojure "1.10.3"]]
    :plugins [[lein-midje "3.1.3"]]
    :profiles {:dev {:dependencies [[midje "1.10.3"]
                                    [org.clojure/tools.namespace "0.2.7"]]
                     :source-paths ["dev"]
                     :repl-options {:init-ns user}}})
