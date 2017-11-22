(ns ch1.exOne8
    (:use [clojure.repl])
    (:use ['ch1.exOne5/abs-user :as 'absnew])
    (:gen-class))

(defn sqrt-iter [guess x]
    (if (good-enough guess x)
        guess
        (sqrt-iter (improve guess x)
                    x)))

(defn improve [guess x]
    (/(+ (/ (x) (* y y)) 
        (* 2 y)) 
            3))

(defn good-enough [guess x]
    (< (absnew (- (* guess guess) x)) 0.001))

