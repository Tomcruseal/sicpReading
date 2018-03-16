(ns ch2.code2
    (:use [clojure.repl])
    (:gen-class))

;(defn make-segment [s e]
;   (vector s e))

;(defn start-segment [x]
;    (x ))

(defn scons [x y]
    (fn [m]
        (cond (= m 0) x
              (= m 1) y)))

(defn scar [z] (z 0))

(defn scdr [z] (z 1))

;constructor for segment 
(defn make-segment [s e]
    (scons s e))

;selector
(defn start-segment [l]
    (scar l))
;selector
(defn end-segment [l]
    (scdr l))

(defn make-point [x y]
    (scons x y))

(defn x-piont [p]
    (scar p))

(defn y-point [p]
    (scdr p))

