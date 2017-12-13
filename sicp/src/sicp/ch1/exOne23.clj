(ns ch1.exOne23
    (:use [clojure.repl])
    (:gen-class))

(defn next [n]
    (if (even? n) (+ n 1)
        (+ n 2)))

(defn smallest-divisor [n]
    (find-divisor n 2))


(defn find-divisor [n test-divisor]
    (cond ((> (square test-divisor) n) n)
           ((divides? test-divisor n) test-divisor)
           :else (find-divisor n (next test-divisor))))

(defn divides? [a b]
    (= (rem b a) 0))

;;test TODO
