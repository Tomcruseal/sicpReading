(ns ch1.exOne9
    (:use [clojure.repl])
    (:gen-class))

(defn user-fac [n]
    ( if (= n1)
          1
          (* n (user-fac (- n 1)))))
;;let me search for some useful standard library if any