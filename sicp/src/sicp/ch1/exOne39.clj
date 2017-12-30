(ns ch1.exOne39
    (:use [clojure.repl])
    (:use [ch1/exOne37/cont-frac])
    (:gen-class))

(defn tan-cf [x k]
    (if (= k 1) 
        1
        (cont-frac (- 0 (*x x)) (- (* 2 k) 1) k)))
