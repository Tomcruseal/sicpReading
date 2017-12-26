(ns ch1.exOne38
    (:use [clojure.repl])
    (:use [ch1.exOne37/cont-frac])
    (:gen-class))

(cont-frac  (fn [x] 1.0) 
                (fn [y] (if (= 0 (mod (+ y 1) 3)))
                (* 2 (/ (+ 1 y) 3) 
                1)) 
        100)

