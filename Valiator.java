package task1;

public class Valiator {
	public String checkComment(String comment) throws SpamCommentException {
		String banMessages [] = { "abcde", "lmno", "pqrst", "wxyz" };
		int frequency = 0;
		for (String banMsg : banMessages) {
			int foundIndex = 0;
			int searchIndex = 0;
			while (foundIndex >= 0) {
				foundIndex = comment.indexOf(banMsg, searchIndex);
				if (foundIndex >= 0) {
					frequency++;
					searchIndex = foundIndex + banMsg.length() + 1;
				}
			}
		}
		if(frequency > 0 && frequency <= 2)
			throw new SpamCommentException("spam comment");
		else if (frequency > 2)
			throw new SpamCommentException("account ban due to spam comment");
		
		return "comment is not spam";
		
	}
	  public String commentTheString(String comment) {
		  
		  try {
			this.checkComment(comment);
		} catch (SpamCommentException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
		  catch (Exception e) {
				// TODO Auto-generated catch block
				return "other exception";
			}
	  
		  return "comment posted";
	  }

}
