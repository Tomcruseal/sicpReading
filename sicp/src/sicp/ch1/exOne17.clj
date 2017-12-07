(ns ch1.exOne17
    (:use [clojure.repl])
    (:gen-class))

(defn new-multi [a b]
    (if (= b 0)
        0
        (+ a (new-multi a (- b 1)))))

(defn user-halve [a]
    (if even? a
        (/ a 2)
        0))

(defn user-double [a]
    (* a 2))
