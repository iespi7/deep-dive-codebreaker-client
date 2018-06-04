package edu.cnm.deepdive.codebreaker.models;

import com.google.gson.annotations.Expose;
import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Game {

  @Expose(deserialize = true, serialize = false)
  private UUID id;
  @Expose(deserialize = true, serialize = false)
  private URI href;
  @Expose(deserialize = true, serialize = false)
  private Date created;
  @Expose
  private Integer length;
  @Expose
  private String characters;
  @Expose
  private Boolean repetitionAllowed;
  @Expose(deserialize = true, serialize = false)
  private boolean surrendered;
  @Expose(deserialize = true, serialize = false)
  private boolean solved;
  @Expose(deserialize = true, serialize = false)
  private String code;
  @Expose(deserialize = true, serialize = false)
  private List<Guess> guesses;

  public UUID getId() {
    return id;
  }

  public URI getHref() {
    return href;
  }

  public Date getCreated() {
    return created;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public String getCharacters() {
    return characters;
  }

  public void setCharacters(String characters) {
    this.characters = characters;
  }

  public Boolean getRepetitionAllowed() {
    return repetitionAllowed;
  }

  public void setRepetitionAllowed(Boolean repetitionAllowed) {
    this.repetitionAllowed = repetitionAllowed;
  }

  public void setSurrendered(boolean surrendered) {
    this.surrendered = surrendered;
  }

  public void setSolved(boolean solved) {
    this.solved = solved;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setGuesses(List<Guess> guesses) {
    this.guesses = guesses;
  }
}
