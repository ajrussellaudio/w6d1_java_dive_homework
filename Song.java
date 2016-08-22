class Song {

  private int tempo;
  private Note[] notes;

  public Song(int tempo, int length) {
    this.tempo = tempo;
    this.notes = new Note[length];
  }

  public void fillMiddleC() {
    for(int i = 0; i < notes.length; i++) {
      notes[i] = new Note(60);
    }
  }

  public int notesCount() {
    int counter = 0;
    for(Note note : notes){
      if(note != null){
        counter++;
      }
    }
    return counter;
  }

  public void fillSequence(int[] sequence) {
    if (sequence.length < notes.length) return;
    for(int i = 0; i < sequence.length; i++) {
      if(sequence[i] != 0) { 
        notes[i] = new Note(sequence[i]);
      }
    }
  }

}