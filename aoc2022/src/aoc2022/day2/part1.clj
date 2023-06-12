(ns aoc2022.day2.part1
  (:require
    [clojure.string :as str]))

(def input (str/split 
             (slurp "src/aoc2022/day2/data") #"\n"))

(reduce + (for [guide input]
            (let [elfs-choice (str (first guide)) my-choice (str (last guide))]
              (case elfs-choice
                "A" (case my-choice "X" 4 "Y" 8 "Z" 3)
                "B" (case my-choice "X" 1 "Y" 5 "Z" 9)
                "C" (case my-choice "X" 7 "Y" 2 "Z" 6)
                ))))


