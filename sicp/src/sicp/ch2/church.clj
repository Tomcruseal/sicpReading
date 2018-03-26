(ns ch2.church
    (:use [clojure.repl])
    (:gen-class))

;;church numerals
(def zero-0 (fn [f]
    (fn [x] x)))

(defn add-1 [n]
    (fn [f] (fn [x] (f (n f) x))))

;;to represent one,just calculate (add-1 zero-0)
;;