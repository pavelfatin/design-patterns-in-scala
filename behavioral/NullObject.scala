trait Sound {
  def play()
} 
  
class Music extends Sound {
    def play() { /* ... */ }
}

object SoundSource {
  def getSound: Option[Sound] = 
    if (available) Some(music) else None
}
  
for (sound <- SoundSource.getSound) {
  sound.play()
}
