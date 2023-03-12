(ns aoc2022.day1.task1 
  (:require
    [clojure.string :as str]))

; (def input (slurp "src/aoc2022/day1/test-data"))
(def input (slurp "src/aoc2022/day1/data"))

(defn my-sum
  [cals]
  (reduce + (map #(Integer. %) cals)))

(defn task1
  [calories]
  (->> (str/split calories #"\n")
       (partition-by #(= "" %))
       (remove #(= '("") %))
       (map #(my-sum %))
       (apply max)))


