(ns ch1.exOne21
    (:use [clojure.repl])
    (:gen-class))

(defn smallest-divisor [n]
    (find-divisor n 2))
;;why iteration(tail recurrence again)?

(defn find-divisor [n test-divisor]
    (cond ((> (square test-divisor) n) n)
           ((divides? test-divisor n) test-divisor)
           :else (find-divisor n (+ test-divisor 1))))

(defn divides1? [a b]
    (if (= (rem b a) 0) true))
;;another better implementarion

(defn divides? [a b]
    (= (rem b a) 0))

;;check prime

(defn prime? [n]
    (= n (smallest-divisor n)))
