(ns ch1.exOne7
    (:use [clojure.repl])
    (:gen-class))

;;here only rewrite function good-enough
(defn good-enough [guess x]
    (< (/ (/ (+ (/ x guess) guess) 2) guess) 1.001))

;;for numbers that are too big or too small,such method does
;;not work