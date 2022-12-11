int maxPathSum(TreeNode* root) {
    int cnt=INT_MIN;
    chk(root, cnt);
    return cnt;
}
int chk(TreeNode* root, int& cnt){
    if(root==NULL){return 0;}
    int l=max(0, chk(root->left, cnt));
    int r=max(0, chk(root->right, cnt));
    cnt=max(cnt, l+r+root->val);
    return root->val+max(l, r);
}
