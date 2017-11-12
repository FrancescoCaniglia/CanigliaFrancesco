$(function() {
$('nav#menu').mmenu({
  // A collection of extension names to enable for the menu.
extensions    : [],

onClick     : {
  // the clicked link should be visibly "selected".
  setSelected   : true
},

// the submenus comes sliding in from the right. 
slidingSubmenus : true,

// navbar options
navbar: {
  add: true,
  //title: "<a href="https://www.jqueryscript.net/menu/">Menu</a>",
  titleLink: "parent"
},

// callback functions
initMenu: function() {},
initPanels: function() {},
}, {
  // CSS classes
classNames: {
  divider: "Divider",
  inset: "Inset",
  nolistview: "NoListview",
  nopanel: "NoPanel",
  panel: "Panel",
  selected: "Selected",
  spacer: "Spacer",
  vertical: "Vertical"
},

// Whether or not the menu should be cloned 
// (and the original menu kept intact).
clone: false,

// The number of milliseconds between opening/closing the menu and panels, 
// needed to force CSS transitions.
openingInterval: 25,

// jQuery selector containing the node-type of panels.
panelNodetype: 'ul, ol, div',

// The number of milliseconds used in the CSS transitions.
transitionDuration: 400
});
});