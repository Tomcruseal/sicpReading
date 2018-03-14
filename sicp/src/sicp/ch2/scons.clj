(ns ch2.scons
    (:use [clojure.repl])
    (:gen-class))

(defn scons [x y]
    (fn [n] (cond (= 0 n)x
                  (= 1 n)y
                  )))
;is just a procedure

(defn scar [x] (x 0))

(defn scdr [x] (x 1))

(println (scar (scons 1 2))) ;; 1
(println (scdr (scons 1 2))) ;; 2
