/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void inorder(TreeNode* root, vector<int> &ans)
{
    if(root == NULL)
    {
        return;
    }
    inorder(root->left,ans);
    ans.push_back(root->val);
    inorder(root->right,ans);          
}
    int rangeSumBST(TreeNode* root, int l, int h) {
        vector<int> ans;
    inorder(root,ans);
    int cnt =0;
    for(int i=0;i<ans.size();i++){
        if(l<=ans[i] && ans[i]<=h){
            cnt+= ans[i];
        }
    }
    return cnt;
        
    }
};
