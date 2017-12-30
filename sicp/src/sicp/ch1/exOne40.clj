(ns ch1.exOne40
    (:use [clojure.repl])
    (:gen-class))

(defn square [x]
  (* x x))

(defn the-averages [x y]
  (/ (+ x y) 2))

(defn average-damp [f]
  (fn [x] (the-averages x (f x))))

(def a ((average-damp square) 10))

(println a)

(defn sqrt [x]
  ())

