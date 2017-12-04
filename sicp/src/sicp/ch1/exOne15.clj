(ns ch1.exOne15
    (:use [clojure.repl])
    (:gen-class))

(defn cube-user [x]
    (* x x x))

(defn p [x]
    (-(* 3 x) (* 4 (cube-user x))))

(defn abs-user [x]
    (if (< x 0) 
        (- 0 x)
        x))

(defn sine-user [angle]
    (if (not (> (abs-user angle) 0.1))
        angle
        (p (sine-user (/ angle 3.0)))))


;;(1) when evaluteting (sine-user 12.15), 5 times in 
;;total will p be used
;;(2)\log_{3}^{n}