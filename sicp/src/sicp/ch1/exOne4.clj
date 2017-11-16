(ns ch1.exOne4
    (:use [clojure.repl])
    (:gen-class))

(defn a-plus-abs-b [a b]
(if (> b 0) + -) a b)

(defn tests [a b]
(+ a b))