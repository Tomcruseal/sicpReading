(ns ch1.exOne37
    (:use [clojure.repl])
    (:gen-class))

(defn cont-frac [n d k]
    (defn cont-frac-helper[n d p]
        (if (> p k) 
            0 
            (/ (n p) (+ (d p) (cont-frac-helper n d (+ p 1))))
            ))
    (cont-frac-helper n d 1))

;;when k=10, the result meets the requirment of precision
;;above is a recurrence version
;;what about 