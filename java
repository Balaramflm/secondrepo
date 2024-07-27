6  ll
    7  sudo tar -xvf nexus.tar.gz
    8  ll
    9  sudo mv nexus-3* nexus
   10  sudo adduser nexus
   11  sudo chown -R nexus:nexus /app/nexus
   12  sudo chown -R nexus:nexus /app/sonatype-work
   13  sudo vi  /app/nexus/bin/nexus.rc 
