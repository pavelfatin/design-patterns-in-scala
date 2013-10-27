trait OutputStream {
  def write(b: Byte)
  def write(b: Array[Byte])
}

class FileOutputStream(path: String) extends OutputStream { /* ... */ }

trait Buffering extends OutputStream {
  abstract override def write(b: Byte) {
    // ...
    super.write(buffer)
  }
}

new FileOutputStream("foo.txt") with Buffering // with Filtering, ...
