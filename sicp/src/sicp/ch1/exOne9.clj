(ns ch1.exOne9
    (:use [clojure.repl])
    (:gen-class))

(defn user-fac [n]
    ( if (= n 1)
          1
          (* n (user-fac (- n 1)))))
;;let me search for some useful standard library if any

(defn user-plus [a b]
    (if (= a 0)
        b
        inc (user-plus (dec a) b)))

(defn user-plus2 [a b]
    (if (= a 0)
        b
        (user-plus2 (dec a) (inc b))))

;;咋一看，这两个过程都是递归的，很明显user-plus2是尾递归（优化）的