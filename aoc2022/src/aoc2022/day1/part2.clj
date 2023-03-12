(ns aoc2022.day1.part2 
  (:require
    [clojure.string :as str]))

; (def input (slurp "src/aoc2022/day1/test-data"))
(def input (slurp "src/aoc2022/day1/data"))

(defn my-sum
  [cals]
  (reduce + (map #(Integer. %) cals)))

(defn find-top-3-calorie-sum
  [calories]
  (->> (str/split calories #"\n")
       (partition-by #(= "" %))
       (remove #(= '("") %))
       (map #(my-sum %))
       (sort)
       (reverse)
       (take 3)
       (reduce +)))


