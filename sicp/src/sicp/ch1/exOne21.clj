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
;;\Theta(\sqrt n)

(defn expmod [base exp m]
    (cond ((= exp 0) 1)
          ((even? exp)
          (rem (square (expmod base (/ exp 2) m))m)
          :else (rem (* base (expmod base (-exp 1) m)m
          )))))

(defn fermat-test [n]
    (defn try-it [a]
        (= (expmod a n n) a))
    (try-it (+ 1  (rand-int (- n 1)))))

(defn fast-prime? [n times]
    (cond ((= times 0) true)
          ((fermat-test n) (fast-prime? n (- times 1)))
          
          :else false))

;;回答