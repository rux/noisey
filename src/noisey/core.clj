(ns noisey.core)

(use 'overtone.live)

(def kick (sample (freesound-path 2086)))


(definst hat [volume 1.0]
  (let [src (white-noise)
        env (env-gen (perc 0.001 0.3) :action FREE)]
    (* volume 1 src env)))



 (def bpm 155)

 (defn beat-length [bpm] (* 1000 (/ 60 bpm )))





 (defn aaa [tempo] (let
      [time (now) beat (beat-length tempo)]
    (at (+ time    0 ) (kick) )
    (at (+ time (* 1 beat) ) (hat)  )
    (at (+ time (* 2.5 beat) ) (kick) )
    (at (+ time (* 3 beat) ) (hat)  ))
   )








 (aaa bpm)
