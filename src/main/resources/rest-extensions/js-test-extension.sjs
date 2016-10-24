function get(context, param){
	return "To test the maven plugin";
}

function post(context, params, input) {
	return "To test the post";
};

function put(context, params, input) {
  	var url = params.url;	
	xdmp.documentInsert(url, input.toObject());
	return url;
};

function deleteFunction(context, params) {
  // return at most one document node
};

exports.GET = get;
exports.POST = post;
exports.PUT = put;
exports.DELETE = deleteFunction;

