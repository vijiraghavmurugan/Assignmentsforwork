package snakenladder;

public class Ladder {
	private int startPosition;
	private int endPosition;

	public int getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}

	public int getEndPosition() {
		return endPosition;
	}

	public void setEndPosition(int endPosition) {
		this.endPosition = endPosition;
	}

	public Ladder(int startPosition, int endPosition) {
		super();
		this.startPosition = startPosition;
		this.endPosition = endPosition;
	}

	public Ladder(int startPosition) {
		super();
		this.startPosition = startPosition;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || this.getClass() != obj.getClass())
			return false;
		Ladder l1 = (Ladder) obj;

		return this.startPosition == l1.startPosition;
	}
	
}
