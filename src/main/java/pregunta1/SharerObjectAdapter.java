package pregunta1;

public class SharerObjectAdapter implements Sharing {

	RedditPoster reddit; 
	public SharerObjectAdapter(RedditPoster reddit)
	{
		this.reddit=reddit;
	}
	@Override
	public void share(String message) {
		reddit.post(message);
	}

}
