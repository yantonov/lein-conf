{:user
 {:dependencies [[pjstadig/humane-test-output "0.8.0"]]
  :plugins [[lein-cljfmt "0.5.1"]
            [lein-kibit "0.1.2"]
            [lein-ancient "0.6.10"]
            [venantius/ultra "0.4.1"]]
  :injections [(use 'clojure.repl)
               (use 'clojure.java.javadoc)
               (require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]}
 :repl
 {:dependencies [[alembic "0.3.2"]
                 [org.clojure/tools.nrepl "0.2.12"]]
  :plugins [[refactor-nrepl "2.2.0"]
            [cider/cider-nrepl "0.12.0"]]
  :injections [(use 'clojure.repl)
               (use 'clojure.java.javadoc)
               (require 'alembic.still)]}}
