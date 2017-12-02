(ns ch1.exOne11
    (:use [clojure.repl])
    (:gen-class))

(defn f [n]
    (cond (< n 3) n)
          :else (+ (f (- n 1))
                (* 2 (f (- n 2)))
                (* 3 (f (- n 3)))))
;;obviously,here is an implementation of recurrence which can lead to stack overflow :)
;;TODO

(defn f1 [n]
    (cond (< n 3 ) n)
          :else (g 2 2 0 n))

(defn g [x3 x2 x1 count]
    (if (= count 0)
        x3
        (g (+ x3 (* 2 x2) (* 3 x3))
            x3 x2 (- count 1)))