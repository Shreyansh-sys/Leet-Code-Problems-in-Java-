class Solution{
	public static boolean findPath(TreeNode root, int [] sequence){
		
		if(root == null)
		return sequence.length == 0;

		return findRecursivePath(root, sequence, 0);
	}

	private static boolean findRecursivePath(TreeNode currentNode, int [] sequence, int sequenceIndex){
	
	if(currentNode == null)
	return false;
	
	if(currentNode.val != sequence[sequenceIndex] || sequenceInddex >= sequence.length)
	return false;

	if(currentNode.left == null && currentNode.right == null && sequenceIndex == sequence.length - 1)
	return true;

	return findRecursivePath(currentNode.left, sequence, sequenceIndex + 1) || 
		findRecursivePath(currentNode.right, sequence, sequenceIndex + 1);

	}
}