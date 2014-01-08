# while-let

Repeatedly executes body while test expression is true, evaluating the body with binding-form bound to the value of test.

I've found this particularly useful with [core.async](https://github.com/clojure/core.async), where you want to loop
until a channel is closed (and it returns nil).

## Installation

In your project.clj add:

![Clojars Version](https://clojars.org/while-let/latest-version.svg)

## Usage

```
(while-let bindings & body)
```

### Simple example

Pop each item off the front of a vector and print it out.

```clojure
(let [data (atom [1 2 3 4 5])]
          (while-let [item (first @data)]
                     (println "item: " item)
                     (swap! data rest)))
```

### Core.async example:

Take from a channel until it gets closed (a closed channel will return `nil`)

```clojure
(go (while-let [data (<! (channel))]
               (println data)))
```

## License

Copyright © 2014 Mark Mandel

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
