function testTransform(context, params, content) {
	
	 var obj = content.toObject();
	 obj.injected = "from transform";
	
	 return obj;
};

exports.transform = testTransform;