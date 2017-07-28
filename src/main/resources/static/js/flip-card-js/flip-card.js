var card = {
	'front': {
		'img': [			'https://res.cloudinary.com/diegobr/image/upload/v1477491518/forest-01_x48cr1.jpg',			'https://res.cloudinary.com/diegobr/image/upload/v1477491518/fog-01_e2iziy.jpg',	'https://res.cloudinary.com/diegobr/image/upload/v1477491518/lake-01_yrddak.jpg'
		],
		
		'title': [
			'Card 01',
			'Card 02',
			'Card 03'
		],
		
		'content': [
			'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tristique nunc urna. Suspendisse blandit dolor tortor, ut accumsan magna congue ut.',
			'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tristique nunc urna. Suspendisse blandit dolor tortor, ut accumsan magna congue ut.',
			'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tristique nunc urna. Suspendisse blandit dolor tortor, ut accumsan magna congue ut.'
		]
	},
	
	'back': {
		'content': [
			'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tristique nunc urna. Suspendisse blandit dolor tortor, ut accumsan magna congue ut. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tristique nunc urna. Suspendisse blandit dolor tortor, ut accumsan magna congue ut.',
			'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tristique nunc urna. Suspendisse blandit dolor tortor, ut accumsan magna congue ut. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tristique nunc urna. Suspendisse blandit dolor tortor, ut accumsan magna congue ut.',
			'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tristique nunc urna. Suspendisse blandit dolor tortor, ut accumsan magna congue ut. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tristique nunc urna. Suspendisse blandit dolor tortor, ut accumsan magna congue ut.'
		]
	}
};

for (var i = 0; i < card.front.img.length; i++) {
	$('.content').append('\
		<article class="contentBlock">\
			<div class="cardFrontSide">\
				<img src="' + card.front.img[i] + '">\
				<div class="cardFrontContent">\
					<h2>' + card.front.title[i] + '</h2>\
					<p>' + card.front.content[i] + '</p>\
				</div>\
			</div>\
			<div class="cardBackSide">\
				<p>' + card.back.content[i] + '</p>\
			</div>\
		</article>\
											 ');
}