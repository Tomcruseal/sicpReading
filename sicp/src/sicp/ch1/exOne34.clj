(ns ch1.exOne34
    (:use [clojure.repl])
    (:gen-class))

(defn f [g]
    (g 2))

(f square)
4

(f (fn [z] (* z (+ z 1))))
6

(f f)
;;因为参数类型对应不上，故编译器应该报错