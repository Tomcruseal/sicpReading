(ns ch1.exOne6
    (:use [clojure.repl])
    (:gen-class))

(defn improve-y [guess x ]
    (average-user guess (/ x guess)))

(defn average-user [x y]
    (/ (+ x y) 2))

(defn sqrt-iter [guess x ]
    (if (good-enough guess x) guess
        (sqrt-iter (improve-y guess x ) x) ))

(defn good-enough [guess x ]
    (< (abs-user (- (square-user guess) x) ) 0.001))

(defn abs-user [x] 
    (if (< x 0) 
        (- 0 x)
        x))

(defn square-user [x]
    (* x x))

;;For this question,the new-if can cause even more recurences which
;;will finally lead to stack overflow 