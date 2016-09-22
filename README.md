pm2-java-spring-boot
====================

```fish
gradle build
npm start
npm run ls
npm run show
cat ~/.pm2/logs/pm2-java-spring-boot-out.log

open http://localhost:8000/

# update java and recompile
gradle build
# refresh page and see as process was restarted

# clean
npm run kill
```
