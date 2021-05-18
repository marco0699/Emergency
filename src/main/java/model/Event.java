package model;

import java.time.LocalTime;

public class Event implements Comparable <Event>{

	enum EventType{
		ARRIVAL, //arriva un nuovo paziente, entra in triage
		TRIAGE, //è finito il triage, entro in sala d'attesa
		TIMEOUT, //passa un certo tempo di attesa
		FREE_STUDIO, //si è liberato uno studio, chiamiamo qualcuno
		TREATED, //paziente curato
		TICK //
	};
	
	private LocalTime time; 
	private EventType type; 
	private Patient patient;
	
	public Event(LocalTime time, EventType type, Patient patient) {
		super();
		this.time = time;
		this.type = type;
		this.patient = patient;
	}

	public LocalTime getTime() {
		return time;
	}

	public EventType getType() {
		return type;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	@Override
	public int compareTo(Event other) {
		return this.time.compareTo(other.time);
	}

	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + ", patient=" + patient + "]";
	} 
	
	
	
}
