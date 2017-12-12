(ns ch1.exOne22
    (:use [clojure.repl])
    (:gen-class))

(defn timed-prime-test [n]
    (newline)
    (println n)
    (start-prime-test n (time)))

(defn start-prime-test [n start-time]
    (if (prime? n)
        (report-prime (- (runtime) start-time))))

(defn report-prime [elapsed-time]
    (println "***")
    (println elapsed-time))

(defn search-for-primes [start end]
    (search-primes-iter start end start))

(defn search-primes-iter [start end count]
    (if (and (<= start count)(> end count))
        (test-prime-test n)
        (search-primes-iter start end (+ count 1)))) 