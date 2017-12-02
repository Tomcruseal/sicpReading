(ns ch1.exOne15
    (:use [clojure.repl])
    (:gen-class))

(defn cube-user [x]
    (* x x x))

(defn p [x]
    (-(* 3 x) (* 4 (cube-user x))))

(defn abs-user [x]
    if (< x 0) (- 0 x)
        x)

(defn sine-user [angle]
    (if (not (> (abs-user angle) 0.1))
        angle
        (p (sine-user (/ angle 3.0)))))
