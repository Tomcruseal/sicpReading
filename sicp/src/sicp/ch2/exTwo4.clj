(ns ch2.exTwo4
    (:use [clojure.repl])
    (:gen-class))

;;2.4
(defn cons [x y]
    (fn [m] (m x y)))

(defn car [z]
    (z (fn [p q] p)))

;;(car (cons (x y))) yields to x !!!

;;Correspondingly
(defn cdr [z]
    (z (fn [p q] q)))
