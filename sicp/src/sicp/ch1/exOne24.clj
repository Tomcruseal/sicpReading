(ns ch1.exOne24
    (:use [clojure.repl])
    (:gen-class))

(defn timed-prime-test [n]
    (newline)
    (println n)
    (start-prime-test n (time)))

(defn start-prime-test [n start-time]
    (if (fast-prime? n)
        (report-prime (- (runtime) start-time))))

(defn report-prime [elapsed-time]
    (println "***")
    (println elapsed-time))