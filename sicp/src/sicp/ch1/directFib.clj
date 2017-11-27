(ns ch1.directFib
    (:use [clojure.repl])
    (:gen-class))

(defn fib [n]
    (cond (= n 0) 0
          (= n 1) 1
          :else (+ fib (- n 1)
                fib (- n 2))))
;;this direct method does no tail-rec optimization

(defn fib2 [n]
    (fib-iter 1 0 n))

(defn fib-iter [a b count]
    (if (= count 0)
        b
        (fib-iter (+ a b) a (- count 1))))
;;this implentation is much like the one in Functiona 
;;Programming in Scala where tail-rec annotation is
;;stated
;;linear iterate

;;below is a problem of cash change, just copy from the book
;;5 kinds of coins:0.5 dollar, 0.25 dollar,10 cent, 5 cent,
;;1 cent
(defn count-change [amount]
    (cc amount 5))

(defn cc [amount kinds-of-coins]
    (cond (= amount 0) 1      ;;if amount is 0, there are 1 kind of way as default 
          (or (< amount 0) (= kinds-of-coins 0)) 0    ;;if a<0 or n=0,there is no way!
          :else (+ (cc amount
                        (- kinds-of-coins 1))
                    (cc (- amount 
                          (first-denomination kinds-of-coins))
                        kinds-of-coins))))

(defn first-denomination [kinds-of-coins]
    (cond (= kinds-of-coins 1) 1
          (= kinds-of-coins 2) 5
          (= kinds-of-coins 3) 10
          (= kinds-of-coins 4) 25
          (= kinds-of-coins 5) 50))
;;assume that hte coins are arranged in increasing order
;;liubei guanyu zhangfei    