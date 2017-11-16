(ns ch1.exOne5
    (:use [clojure.repl])
    (:gen-class))

(defn p [] (p))

(defn test-order [x y]
(if (= x 0) 0 y))
