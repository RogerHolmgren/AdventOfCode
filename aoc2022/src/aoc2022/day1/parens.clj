(ns aoc2022.day1.parens)

(def input "(1+(2*3()))")
(def left-parens "(")

(defn max-depth [input]
  (->> input
    (re-seq #"[()]")
    (map #(if (= left-parens %) 1 -1))
    (reductions +)
    (apply max)))

(max-depth input)

