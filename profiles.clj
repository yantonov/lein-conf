{:user
 {:dependencies [[pjstadig/humane-test-output "0.7.0"]]
  :plugins [[lein-cljfmt "0.3.0"]
            [lein-kibit "0.1.2"]
            [lein-ancient "0.6.7"]
            [jonase/eastwood "0.2.1"]
            [venantius/ultra "0.3.4"]]
  :ultra {:color-scheme :solarized_dark}
  :injections [(use 'clojure.repl)
               (use 'clojure.java.javadoc)
               (require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]}
 :repl
 {:dependencies [[alembic "0.3.2"]
                 [org.clojure/tools.nrepl "0.2.12"]]
  :plugins [[refactor-nrepl "2.0.0-SNAPSHOT"]
            [cider/cider-nrepl "0.10.1"]]
  :injections [(use 'clojure.repl)
               (use 'clojure.java.javadoc)
               (require 'alembic.still)]}}
