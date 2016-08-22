class Note {

  private int noteNum; // 0..127

  public Note(int noteNum) {
    this.noteNum  = noteNum;
  }

  public int noteNum() {
    return this.noteNum;
  }

  public double freq() {
    double power = (noteNum - 69) / 12.0;
    double frequency = Math.pow(2, power) * 440;
    return frequency;
  }

}

